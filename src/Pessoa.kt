class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-24"

    private set

    inner class Endereco{
        var rua = "Rua teste"
    }
}

fun main(){
    val jether = Pessoa()

    print(jether.nome)
    print(jether.cpf)

    print(jether.Endereco().rua)
}