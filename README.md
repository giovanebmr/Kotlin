# Kotlin Training


# Trabalhando com o compilador de linha de comando no Windows

1º Baixar o arquivo kotlin-compiler-1.4.30.zip no link: https://github.com/JetBrains/kotlin/releases/tag/v1.4.30

2º Descompactar o arquivo no diretório raiz e adicionar o diretório bin ao path do sistema:

``` C:\kotlin-compiler-1.4.30\kotlinc\bin ```

3º Criar um arquivo e colocar o código fonte, para salvar usar a extensão ".kt"

``` calculadora.kt ```

4º Para compilar usar:

``` $ kotlinc calculadora.kt -include-runtime -d calculadora.jar ```

A opção "-d" indica o caminho de saída para arquivos de classe gerados, que podem ser um diretório ou um arquivo ".jar". A -include-runtimeopção torna o arquivo .jar resultante autocontido e executável, incluindo nele a biblioteca Kotlin de tempo de execução.

5º Para executar usar:

``` java -jar calculadora.jar ```

6º Para ver todas as opções disponíveis do comando basta sinalizar a opção "-help"

``` kotlinc -help ```

Referência: https://kotlinlang.org/docs/tutorials/command-line.html


