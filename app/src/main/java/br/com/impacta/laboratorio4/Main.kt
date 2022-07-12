package br.com.impacta.laboratorio4

fun main() {
    var desconto: Int = 0
    var idade: Int = 33

    desconto = when {
        idade > 50 -> 30
        idade in 25..50 -> 15
        else -> 5
    }

    println("O desconto obtido foi de $desconto%.")
}