package wtf.s1.pudge

import android.app.Application
import android.content.Context
import android.util.Log
import wtf.s1.pudge.hugo2.DebugLog
import wtf.s1.pudge.hugo2.Hugo2
import wtf.s1.stick.core.ITracer
import wtf.s1.stick.core.MethodTrace

@DebugLog
class App: Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MethodTrace.setImpl(object: ITracer {

            override fun i(method: Int) {

            }

            override fun o(method: Int) {

            }
        })

        Hugo2.setLogger(object: Hugo2.Hugo2Logger {
            override fun logI(clazz: String, method: String, params: String) {
                super.logI(clazz, method, params)
                Log.i("hugo", "---> $clazz $method $params")
            }

            override fun logO(clazz: String, method: String) {
                super.logO(clazz, method)
                Log.i("hugo", "<--- $clazz $method")
            }
        })
    }
}