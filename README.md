# 📦 Sistema de Etiquetas de Preço para Produtos
Projeto de prática baseado no curso do professor Nélio Alves.
Consiste em um programa Java para cadastrar produtos comuns, usados ou importados e imprimir suas etiquetas de preço formatadas de acordo com seu tipo.

## 🎯 Objetivo
Ler os dados de N produtos informados pelo usuário. No final, exibir a etiqueta de preço de cada produto com as informações adequadas, conforme mostrado no exemplo.
![image](https://github.com/user-attachments/assets/5829950d-4d66-45b8-8b0d-ab6fceb01d4a)


## 📋 Regras de Negócio
Todo produto possui: nome e preço.

Produtos importados possuem uma taxa de alfândega, que é somada ao preço.

Produtos usados possuem uma data de fabricação, que aparece na etiqueta.

O sistema deve usar herança e polimorfismo para implementar essas variações.

## 🧱 Estrutura
Product.java: classe base com nome, preço e método priceTag().

ImportedProduct.java: herda de Product e adiciona taxa de alfândega.

UsedProduct.java: herda de Product e adiciona data de fabricação.

Main.java: ponto de entrada, coleta os dados e imprime as etiquetas.

## 🛠️ Tecnologias
Java 17+

Eclipse (ou outra IDE)

SimpleDateFormat para datas

## ▶️ Como Executar
Clone o repositório

Compile os arquivos .java

Execute Main.java

Insira os dados conforme solicitado no terminal

## 📌 Exemplo de Execução e saída esperados:
![image](https://github.com/user-attachments/assets/2e34524e-75a0-4269-9b04-077c2ec6abb9)

## 🎯 Resultado obtido:
![image](https://github.com/user-attachments/assets/10a69db0-121a-4b00-a385-4fa80c1b782e)


