package jp.techacademy.shiori.tazawa.taskapp_category

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable
import java.util.*

// Realmが内部的にTaskを継承したクラスを生成して利用するためopen修飾子をつける
open class Task: RealmObject(), Serializable {
    var title: String = "" // タイトル
    var contents: String = "" // 内容
    var date: Date = Date() // 日時
    var category: String = "" // カテゴリ

    // idをプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}