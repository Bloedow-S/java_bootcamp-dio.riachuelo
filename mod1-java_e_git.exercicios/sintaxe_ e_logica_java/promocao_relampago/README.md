### Exercício Promoção Relâmpago - Java

Este exercício inclui manipulação de números decimais em Java usando BigDecimal.  
O programa lê o valor de uma compra, calcula o desconto aplicável e retorna uma mensagem informando a porcentagem de desconto.

O conceito principal do exercício é entender o que é o descontoPercentual, como ele é calculado e aplicado dependendo do valor da compra.

Exemplo de entrada:

> 120.00

Exemplo de saída:

> Desconto de 20%
---
* Aprendizados / Conceitos:
    * BigDecimal: usado para representar valores decimais de forma precisa, evitando problemas de arredondamento do `float` ou `double`.
    * descontoPercentual: variável que armazena a porcentagem de desconto a ser aplicada (0, 10, 20, etc.).
    * compareTo(): método do `BigDecimal` usado para comparar valores (`-1` se menor, `0` se igual, `1` se maior).
    * Estruturas condicionais (`if / else if / else`) para definir a regra de desconto com base no valor da compra.
    * String.format() ou concatenação para retornar a mensagem final de forma clara.
    * Boa prática: inicializar `descontoPercentual` usando `BigDecimal.ZERO` ou outro valor inicial adequado.
