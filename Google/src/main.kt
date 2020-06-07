import java.util.Scanner
fun main(args:Array<String>){
    println("This Kotlin Program is for finding the \n\t* * * Average Marks * * *\n and the \n\t* * * Final Grade * * *\n of your Semester by taking three subjects marks as an input")
    val read = Scanner(System.`in`)
    print("Enter your name:")
    val name = readLine()
    print("Enter your Id Number:")
    val id = readLine()
    print("Enter your Subjects names:")
    val sub1 = readLine()
    val sub2 = readLine()
    val sub3 = readLine()
    print("Enter your Subjects marks following these Subjects pattern\n $sub1\n $sub2\n $sub3\n\t:")
    var m1 = read.nextInt()
    var m2 = read.nextInt()
    var m3 = read.nextInt()
    val subjects = mutableListOf(sub1, sub2, sub3)
    var c:Int = 0
    val marks = mutableListOf(m1,m2,m3)
    for(values in marks) {
        print(subjects[c]+" : ")
        c+=1
        Grade(values)
    }
    val lamb = {a1:Int,a2:Int,a3:Int -> a1+a2+a3}
    val out = lamb(m1,m2,m3)
    val calculation = {less:Int -> less/3}
    var mark = finalhigherorder(out,calculation)
    println("Heyy!! $name bearing Id Number : $id \n")
    print("You are ")
    failandpass(m1,m2,m3)
    println()
    println("=> Sum of all subjects marks is $out The Average Marks you got are "+mark+"\n")
    print("==> and Final Grade you got is ")
    Grade(mark)
    println()
}
fun finalhigherorder(vari : Int,operation:(Int)->Int):Int{
    return operation(vari)
}
fun failandpass(a:Int,b:Int,c:Int){
    val arr = listOf(a,b,c)
    var c:Int=3
    for(marks in arr){
        if(marks<40) c=c-1
    }
    when(c){
        0 -> println("-> Failed in all subjects ")
        1 -> println("-> Passed in one subject and failed in two subjects ")
        2 -> println("-> Passed in two subjects and failed in one subject ")
        3 -> println("-> Passed in all subjects ")
    }
}
fun Grade(a:Int){
    when (a) {
        in 0..40 -> println("Failed")
        in 40..60 -> println("D Grade")
        in 61..70 -> println("C Grade")
        in 71..80 -> println("B Grade")
        in 81..90 -> println("A Grade")
        in 91..100 -> println("X Grade")
    }
}