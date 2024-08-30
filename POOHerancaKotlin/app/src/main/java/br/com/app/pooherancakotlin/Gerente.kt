package br.com.app.pooherancakotlin

class Gerente : Funcionario() {
    private var comissao: Double? = null
    private var totalFuncionarios: Int? = null

    fun getComissao() : Double {
        return comissao!!
    }

    fun setComissao(comissao: Double?) {
        this.comissao = comissao
    }

    fun getTotalFuncionarios() : Int {
        return totalFuncionarios!!
    }

    fun setTotalFuncionario(totalFuncionarios: Int?) {
        this.totalFuncionarios = totalFuncionarios
    }
}