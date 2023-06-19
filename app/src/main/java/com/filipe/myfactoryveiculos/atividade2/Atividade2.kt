package com.filipe.myfactoryveiculos.atividade2



class Atividade2 {
}


fun main(){
    var moto = Moto()
    var carro = Carro()
    moto.acelerar()
    println(moto.velocidadeAtual())
    moto.reduzir()
    println(moto.velocidadeAtual())
    carro.reduzir()
    println(carro.velocidadeAtual())


}

interface Veiculo {
      var long:Int
      var acceleration: Int
      fun acelerar()
      fun reduzir():Int

    fun salvar() = long + acceleration

    fun velocidadeAtual():String = "esta e a sua velocidade atual: ${salvar()}"

}

class Carro: Veiculo {
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

class Moto: Veiculo{
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
