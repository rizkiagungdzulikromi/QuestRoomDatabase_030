package com.example.pertemuan10.ui.navigation

interface alamatnavigasi {
    val route: String
}
object DestinasiHome : alamatnavigasi {
    override val route = "home"
}

object DestinasiDetail : alamatnavigasi {
    override val route = "detail"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}
object DestinasiUpdate : alamatnavigasi {
    override val route = "update"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}