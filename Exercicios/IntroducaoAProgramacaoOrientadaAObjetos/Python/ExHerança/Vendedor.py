from funcionario import Funcionario

# Classe Vendedor que estende Funcionário
class Vendedor(Funcionario):
    # Taxa de comissão fixa para o vendedor
    COMISSAO = 0.05

    def __init__(self, nome, salario, vendas):
        super().__init__(nome, salario)
        self.vendas = vendas

    def calcular_salario_anual(self):
        # Calcula o salário anual, multiplicando o valor das vendas, pela taxa de comeissão e pelo número de meses.  
        return (self.get_salario() + self.vendas) * (Vendedor.COMISSAO * 12)

    def calcular_pagamento_mensal(self):
        # Divide o salário anual por 12, para obter o pagamento mensal
        return self.calcula_salario_anual() / 12
