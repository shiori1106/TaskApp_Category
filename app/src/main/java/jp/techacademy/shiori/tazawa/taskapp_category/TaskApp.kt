package jp.techacademy.shiori.tazawa.taskapp_category

import android.app.Application
import io.realm.Realm

class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()

        // Realmを初期化
        Realm.init(this)
    }
}