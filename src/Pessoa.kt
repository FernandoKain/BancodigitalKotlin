class Pessoa {
    var nome: String = "Fernando"
    var cpf: String = "123.123.123-24"

    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main(){
    val p1 = Pessoa()

    print(p1.nome)
    print(p1.cpf)
}