# Exercício do estudo de caso GUI e imagens gráficas
## 8.1 
Estenda o programa das figuras 8.17 a 8.19 para desenhar aleatoriamente retângulos e ovais. 

Crie as classes **MyRectangle** e **MyOval**.
Essas duas classes devem incluir as coordenadas ```x1```, ```y1```, ```x2```, ```y2```, uma cor e um flag boolean para determinar se a forma é preenchida.

Declare um construtor em cada classe com argumentos para inicializar todas as variáveis de instância. 
Para ajudar a desenhar retângulos e ovais, cada classe deve fornecer os métodos ```getUpperLeftX```, ```getUpperLeftY```, ```getWidth``` e ```getHeight```, que calculam a coordenada x superior esquerda, a coordenada y superior esquerda e a largura e altura, respectivamente. 
A coordenada x superior esquerda é a menor dos dois valores da coordenada x, a coordenada y superior esquerda é a menor dos valores dois da coordenada y, a largura é o valor absoluto da diferença entre os dois valores da coordenada x e a altura é o valor absoluto da diferença entre os dois valores das coordenadas y.

A classe **DrawPanel**, que estende **JPanel** e trata a criação das formas, deve declarar três arrays, um para cada tipo de forma. 
O comprimento de cada array deve ser um número aleatório entre 1 e 5. 
O construtor da classe **DrawPanel** preencherá cada um dos arrays com formas de posição aleatória, tamanho, cor e preenchimento.

Além disso, modifique todas as três classes de forma a incluir o seguinte:

a) Um construtor sem argumentos que configura as coordenadas da forma como 0, a cor da forma como ```Color.BLACK``` e a propriedade preenchida como false (**MyRectangle** e **MyOval** somente).

b) Métodos ```set``` para as variáveis de instância em cada classe. Os métodos que configuram um valor de coordenada devem verificar se o argumento é maior ou igual a zero antes de configurar a coordenada — se não for, devem configurar a coordenada como zero. O construtor deve chamar os métodos set em vez de inicializar as variáveis locais diretamente.

c) Os métodos ```get``` para as variáveis de instância em cada classe. O método ```draw``` deve referenciar as coordenadas pelos métodos ```get``` em
vez de acessá-los diretamente.
