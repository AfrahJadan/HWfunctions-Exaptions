import kotlin.random.Random
import kotlin.random.nextInt

/*fun main() {
//EX(1)
    /*  val numLet= "AnonymousFunction".count()
    println(numLet)
   */
//the result is 17
//EX(2)
    /*  val numLet= "AnonymousFunction".count({letter->
    letter =='u'})
    println(numLet)//the result is 2
   */
//EX(3)
    /* println(
        {
        val currYear = 2018
        "Welcome to OurVillage, Mayor! (copyright $currYear)"
        }()
    )// the result is Welcome to OurVillage, Mayor! (copyright 2018)
    */
//EX(4)
/*
    val helloFunction: () -> String ={
        val currYear = 2018
        "Welcome to OurVillage, Mayor! (copyright $currYear)"
    }
    println(helloFunction())
// the result is Welcome to OurVillage, Mayor! (copyright 2018)
 */
//EX(5)
    /* val helloFunction: (String) -> String ={ pName ->
        val currYear = 2018
        "Welcome to OurVillage, $pName! (copyright $currYear)"
    }
    println(helloFunction("Afrah"))
//the result is Welcome to OurVillage, Afrah! (copyright 2018)
    */
    //EX(6)
    /* val helloFunction: (String) -> String ={ it ->
        val currYear = 2018
        "Welcome to OurVillage, $it! (copyright $currYear)"
    }
    println(helloFunction("Afrah"))
// the same result but replace the pName with it case it 1 arguments
    */
//EX(7)
    /* val helloFunction: (String, Int) -> String ={ pName, noBuild  -> // 2 arguments
        val currYear = 2018
        println("Adding $noBuild Houses")
        "Welcome to OurVillage, $pName! (copyright $currYear)"
    }
    println(helloFunction("Afrah",4))
    // the result is Adding 4 Houses, Welcome to OurVillage, Afrah! (copyright 2018)
    */
//EX(8)
    /*  val helloFunction={ pName:String, noBuild:Int->
        val currYear = 2018
        println("Adding $noBuild Houses")
        "Welcome to OurVillage, $pName! (copyright $currYear)"
    }
    println(helloFunction("Afrah",4))
    // the same Result just we merge the type with its name in the same arguments
   */
    //Ex(1-9)//write the same function in the main (helloFunction)
    /* val helloFunction={ pName:String, noBuild:Int->
        val currYear = 2018
        println("Adding $noBuild Houses")
        "Welcome to OurVillage, $pName! (copyright $currYear)"
    }
    runSim("Afrah", helloFunction) // call the new Function inside the main outside the Functions
}//for main
//Ex(9-2)//create new function outside the main and take the same data type for the helloFunction
fun runSim(pName:String,helloFunction:(String,Int)->String){
    val noBuild= Random.nextInt(1..3)
    println(helloFunction(pName,noBuild))
}
    */
//Ex(10-1)
//write the same function (helloFunction) but write the calling sentence in it and deleted from outside the previse function
    /*  runSim("Afrah") {pName,noBuild->
        val currYear = 2018
        println("Adding $noBuild Houses")
        "Welcome to OurVillage, $pName! (copyright $currYear)"
    }
} //for main
//Ex(10-2)//new function outside the main
fun runSim(pName:String,helloFunction:(String,Int)->String){
val noBuild= Random.nextInt(1..3)
println(helloFunction(pName,noBuild))
}
   */

//}//for main
//Ex(11-inline)
/*inline  fun runSim(
    pName:String,
    helloFunction:(String,Int)->String
){
    val noBuild= Random.nextInt(1..3)
    println(helloFunction(pName,noBuild))
}
 */
/*//the result for Decompiled Kotlin bytecode for ourVillage.kt main function, (inline) runSim function:
  public static final void main() {
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }
   public static final void runSim(@NotNull String pName, @NotNull Function2 helloFunction) {
      int $i$f$runSim = 0;
      Intrinsics.checkNotNullParameter(pName, "pName");
      Intrinsics.checkNotNullParameter(helloFunction, "helloFunction");
      Random var10000 = (Random)Random.Default;
      byte var4 = 1;
      int noBuild = RandomKt.nextInt(var10000, new IntRange(var4, 3));
      Object var6 = helloFunction.invoke(pName, noBuild);
      boolean var5 = false;
      System.out.println(var6);
   }
}
 */
//Ex(12-add new fun and passing a fun reference)
//} //for main
/*inline  fun runSim(
    pName:String,
    cosPri:(Int)-> Unit,
    helloFunction:(String,Int)->String
)
{
    val noBuild= Random.nextInt(1..3)
    cosPri(noBuild)
    println(helloFunction(pName,noBuild))
}

//Create New Function(prConCos) uot side the main
fun prConCos(noBuild:Int){
val cos =400
println("Construction Cos:${cos*noBuild}")
}

fun main() {
    runSim("Afrah",::prConCos) {pName,noBuild->
        val currYear = 2018
        println("Adding $noBuild Houses")
        "Welcome to OurVillage, $pName! (copyright $currYear)"
    }
}
// the result Ex(12) is Construction Cos:800
//Adding 2 Houses
//Welcome to OurVillage, Afrah! (copyright 2018)

 */

 *///for main}
//Ex(13)//I create new main and create new function outside this main then passing the new function to the function i already created in previse Ex
fun main() {
    runSim()
}
fun runSim(){
    val helloFunction= conFigHello()
    println(helloFunction("Afrah"))
}
fun conFigHello():(String)-> String{
    val strType= "Hospitals"
    var noBuilding= 4
    return {pName:String->
        val currYear = 2018
        noBuilding+=1
        println("Adding $noBuilding $strType")
        "Welcome to OurVillage, $pName! (copyright $currYear)"
    }
}
//the result Ex(13) is Adding 5 Hospitals
//Welcome to OurVillage, Afrah! (copyright 2018)
