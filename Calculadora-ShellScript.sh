#!/bin/bash

clear

Calculadora(){
escolha=1
while [ $escolha -ne 0 ]; do
    
    echo " -- CALCULADORA --"
    echo ""
    echo "Insira o primeiro número que deseja efetuar alguma das quatro operações: "
        read num1
    echo "Insira o primeiro número que deseja efetuar alguma das quatro operações: "
        read num2

    echo "Selecione as operações:"
    echo "1) Somar"
    echo "2) Diminuir"
    echo "3) Multiplicar"
    echo "4) Dividir"
    echo "0) Sair"
        read escolha

   case $escolha in 
        1) Somar ;; 
        2) Diminuir ;;
        3) Multiplicar ;;
        4) Dividir ;;
        0) Sair ;;
        *)"Opcao desconhecida." ; echo;
    esac
done
}

Somar(){
    soma=$[$num1+$num2]
    echo "Resultado da soma: $soma" 
Calculadora
}

Diminuir(){
    subtrair=$[$num1-$num2]
    echo "Resultado da subtração: $subtrair"
Calculadora
}

Multiplicar(){
    mult=$[$num1*$num2]
    echo "Resultado da multiplicação: $mult"
Calculadora
}

Dividir(){
    if [ $num1 -eq 0 ] ; then
         echo "Não foi possível realizar divisão."
    elif [ $num2 -eq 0 ]; then
         echo "Não foi possível realizar divisão."
    else
         div=$[$num1/$num2]
         echo "Resultado da divisão: $div"
    fi
Calculadora
}

Sair(){
   exit 0
}
Calculadora

