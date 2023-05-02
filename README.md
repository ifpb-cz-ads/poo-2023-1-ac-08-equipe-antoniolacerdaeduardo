<h1>Atividade Colaborativa 8.03</h1>
<h2>Questão 03 - Por que construtores de superclasses não são herdados por subclasses?</h2>
<p>Os construtores de superclasses não podem ser herdados por suas subclasses pois os contrutores não são considerados membros da classe em si, mas sim um método especial para inicializar objetos da classe, ou seja, os contrutores são algo único a cada classe, portanto não podem ser herdados.</p>
<p>O que pode acontecer é que a classe filha pode fornecer seu próprio construtor, que pode chamar o construtor da classe pai usando a palavra chave "super".</p>

