fun max(a:Int, b:Int):Int{
	return if (a > b) a else b
}

fun max2(a:Int, b:Int):Int = if (a > b) a else b

fun displayMax(a:Int, b:Int):Unit{
	println(max(a,b))
}