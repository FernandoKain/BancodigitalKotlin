class Pessoa {
    var nome: String = "Fernando"
    var cpf: String = "123.123.123-24"

    private set

    inner class Endereco{
        var rua = "Rua teste"
    }
}

fun main(){
    val p1 = Pessoa()

    print(p1.nome)
    print(p1.cpf)

    print(p1.Endereco().rua)
}