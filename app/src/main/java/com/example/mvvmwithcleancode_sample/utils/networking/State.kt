package com.example.mvvmwithcleancode_sample.utils.networking
import com.example.mvvmwithcleancode_sample.utils.networking.Status.*

data class State<out T>(
    val status: Status,
    val data : T?,
    val message : String?
){
    companion object{
        fun<T> success(msg : String? , data: T?): State<T> = State(SUCCESS,data,msg)
        fun<T> loading(data : T?) : State<T> = State(LOADING,data,null)
        fun<T> error(msg : String,data : T?): State<T> = State(ERROR,data,msg)
    }
}