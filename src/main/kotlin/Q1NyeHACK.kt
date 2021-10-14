fun main (args:Array<String>){
    var auraDisplay = "green"
    var GmHealthPoints = 89
    val Karmavalue = (Math.pow(Math.random(), (110 - GmHealthPoints) / 100.0) * 20 ).toInt()


    println(" Aura Color for player: $auraDisplay ")

    when(Karmavalue ){
        in 0..5 -> auraDisplay= "red"
        in 6 .. 10 ->auraDisplay=  "orange"
        in 11 .. 15 ->auraDisplay= "purple"
        in 16 ..20 ->auraDisplay= "green"
    }
    println("player’s karma values $Karmavalue")
    println( "player’s aura color is $auraDisplay ")

}
