package com.example.weatherpictureapp.core.shared_preferences

interface BaseSharedPrefs {
	fun saveString(key: String, value: String)
	fun getString(key: String): String
	fun saveInt(key: String, value: Int)
	fun getInt(key: String): Int
	fun saveBoolean(key: String, value: Boolean)
	fun getBoolean(key: String): Boolean
	fun saveFloat(key: String, value: Float)
	fun getFloat(key: String): Float
	fun saveLong(key: String, value: Long)
	fun getLong(key: String): Long
	fun remove(key: String)
	fun clear()
}
