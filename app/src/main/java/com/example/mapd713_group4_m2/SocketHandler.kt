package com.example.mapd713_group4_m2

import io.socket.client.IO
import io.socket.client.Socket
import java.net.URISyntaxException

object  SocketHandler {
    lateinit var mSocket: Socket
    @Synchronized
    fun setSocket() {
        try {
            mSocket = IO.socket("http://127.0.0.1:5000/")
        }
        catch (e: URISyntaxException) {
        }
    }
    @Synchronized
    fun getSocket(): Socket {
        return mSocket
    }
    @Synchronized
    fun establishConnection() {
        mSocket.connect()
    }
    @Synchronized
    fun closeConnection() {
        mSocket.disconnect()
    }
}