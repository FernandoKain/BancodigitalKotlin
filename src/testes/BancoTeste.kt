package testes

import Banco


fun main(){
    val bancoDoEstado = Banco(nome = "Banco do Estado", numero = 12)

    println(bancoDoEstado.nome)
    println(bancoDoEstado.numero)

    val  bancoDoEstado2 = bancoDoEstado.copy(nome = "Banco do Estado 2")

    println(bancoDoEstado2.info())

}