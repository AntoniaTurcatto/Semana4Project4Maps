fun main() {

    //1 - Como criar um Map em Kotlin com as cores e seus respectivos códigos RGB?
    val colorsMap = mutableMapOf("Red" to  "255,0,0", "Orange" to "(255,165,0)", "Yellow" to "(255,255,0)")

    //2 - Como verificar se um determinado elemento existe em um Map em Kotlin?
    colorsMap.contains("Blue")

    //3 - Como remover um elemento específico de um Map em Kotlin?
    colorsMap.remove("Orange")

    print(colorsMap.entries)
}