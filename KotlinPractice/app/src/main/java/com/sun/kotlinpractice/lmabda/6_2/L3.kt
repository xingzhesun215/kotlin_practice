enum class USER {
    NORMAL, VIP
}

fun getPrice(userType: USER): (Int) -> Double {//lambda表达式作为返回,(Int)表示参数类型为int,->Double表示返回类型为double
    if (userType == USER.NORMAL) {
        return { it * 1.0 }
    }
    return { it * 0.88 }
}


fun main(args: Array<String>) {

    val normalUserPrice = getPrice(USER.NORMAL)(200)
    println("普通用户价格:$normalUserPrice")

    val vipUserPrice = getPrice(USER.VIP)(200)
    println("VIP用户价格:$vipUserPrice")

}