package com.example.studentcalculator

class OperationClass {
    var listaEstudiantes =arrayListOf<StudentClass>()

    fun registrarEstudiante(estudiante: StudentClass){

        listaEstudiantes.add(estudiante)
    }

    fun imprimirListaEstudiantes(){
        for(est in listaEstudiantes){
            println(est)
        }
    }

    fun calcularPromedio(est: StudentClass): Double {

        var prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota4+est.nota5)/5

        return prom
    }
}