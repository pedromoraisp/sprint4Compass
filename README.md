# sprint4Compass

AVALIAÇÃO SPRINT 4
A API a seguir deverá ser criada utilizando TDD. A cobertura mínima de código esperada para
essa atividade é de 50%.
Deve criar uma API que permita o cadastro de partidos políticos e seus associados. Um partido
pode ter vários associados vinculados. Um partido é composto pelas seguintes informações:
• Nome do Partido
• Sigla
• Ideologia
• Data de Fundação
O campo ideologia só permite três valores: Direita, Centro e Esquerda.
Um associado é composto pelas seguintes informações:
• Nome
• Cargo Político
• Data de Nascimento
• Sexo
O campo sexo só permite dois valores: Masculino e Feminino. O campo cargo político permite
os valores: Vereador, Prefeito, Deputado Estadual, Deputado Federal, Senador, Governador, Presidente
e Nenhum.
Os campos data de fundação e data de nascimento devem ser salvos no banco seguindo o
formato da ISO 8601. Mas na hora de serializar e enviar no response as datas têm que estar no formato
brasileiro de datas.
As chaves primárias serão geradas automaticamente. Todas as informações são obrigatórias:
caso não seja passado algum dado, a API deverá retornar um erro tratado, que deve informar ao usuário
qual informação falta para o cadastro ou atualização ser realizado com sucesso.
Os endpoints para essa API serão os seguintes:
Associado
• POST - /associados
• POST - /associados/partidos (Vincula um associado a um partido, com o body: {“idAssociado”:
10, “idPartido”: 10})
• GET - /associados (Ter uma opção de filtrar associados de acordo com seu cargo político e
outra de ordenar por nome)
• GET - /associados/{id}
• PUT - /associados/{id}
2
• DELETE - /associados/{id}
• DELETE - /associados/{id}/partidos/{id} (Remove determinado associado daquele partido)
Partido
• POST - /partidos
• GET - /partidos (Ter uma opção de filtrar partidos de acordo com sua ideologia)
• GET - /partidos/{id}
• GET - /partidos/{id}/associados (Listar todos os associados daquele partido)
• PUT - /partidos/{id}
• DELETE - /partidos/{id}
