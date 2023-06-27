from funcionario import Funcionario

# Classe Desenvolvedor que estende Funcionário


class Desenvolvedor(Funcionario):
    # Enum para representar os níveis de experiência do Desenvolvedor
    class NivelExperiencia:
        # Multiplicador para o nível iniciante
        INICIANTE = 0.8
        # Multiplicador para o nível intermediário
        INTERMEDIARIO = 1.0
        # Multiplicador para o nível avançado
        AVANCADO = 1.2

    def __init__(self, nome, salario, nivel):
         super().__init__(nome, salario)
         self.nivel = nivel

    def calcular_salario_anual(self):
         # Calcula o salário anual, multiplicando pelo multiplicador do nível de experiência
         return self.get_salario() * (12 * self.nivel)

    def calcular_pagamento_mensal(self):
          # Divide o salário anual por 12, para obter o pagamento mensal
         return self.calcular_salario_anual() / 12
        
