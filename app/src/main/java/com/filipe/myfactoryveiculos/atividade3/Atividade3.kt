package com.filipe.myfactoryveiculos.atividade3

class Atividade3 {
}

fun main(){
    var factory = veiculoFactory()
    var listaVeiculo:MutableList<Veiculo> = mutableListOf()

    for (i in 1..20){
        val veiculo = factory.criarVeiculo(i % 2)
        listaVeiculo.add(veiculo)
    }

    listaVeiculo.forEach {
            veiculo ->
        if (veiculo is Carro){
            println("Este Veiculo e um Carro")
        }else println("Este Veiculo e uma Moto")
        veiculo.acelerar()
        veiculo.acelerar()
        veiculo.acelerar()
        veiculo.acelerar()
        veiculo.acelerar()
        veiculo.acelerar()
        veiculo.acelerar()
        println(veiculo.velocidadeAtual())

    }

}

class veiculoFactory{
    fun criarVeiculo(type:Int):Veiculo {
        return when(type){
            1 -> Moto()
            else -> Carro()
        }
    }
}

abstract class Veiculo {
    abstract var long:Int
    abstract var acceleration: Int
    abstract fun acelerar()
    abstract fun reduzir():Int

    fun salvar() = long + acceleration

    fun velocidadeAtual():String = "e sua velocidade atual: ${salvar()}km por hora"

}

class Carro: Veiculo(){
    override var acceleration = 0
    override var long = 0

    override fun acelerar() {
        acceleration++
    }

    override fun reduzir(): Int {
        acceleration--
        if (acceleration < 0){
            acceleration = 0
        }
        return acceleration
    }

}

class Moto: Veiculo(){
    override var acceleration = 5
    override var long = 0

    override fun acelerar() {
        acceleration++
    }

    override fun reduzir(): Int {
        acceleration--
        if (long < 0){
            long = 0
        }
        return long
    }

}
