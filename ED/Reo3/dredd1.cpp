#include <iostream>

using namespace std;

typedef int Dado;

class pilhav {
    private:
        int capacidade;
        Dado *dados;
        int tamanho;
        int posTopo;
    public:
        pilhav(int cap = 100);
        ~pilhav();
        void empilha(Dado valor);
        Dado desempilha();
        Dado espia(); 
        void depura(); 
        void info();  
};

pilhav::pilhav(int cap){
	capacidade = cap;
	tamanho = 0;
	posTopo = -1;
	dados = new Dado[cap];
}

pilhav::~pilhav(){
	delete[] dados;
}

void pilhav::empilha(int valor){
	dados[++posTopo]= valor;
	tamanho++;
}

Dado pilhav::desempilha(){
	int valor = dados[posTopo];
	posTopo--;
	tamanho--;
	return valor;
}

Dado pilhav::espia(){
	return dados[posTopo];
}

void pilhav::depura(){
	for (int i = 0; i < tamanho; i++)
	{
		cout << dados[i] << " ";
	}
}

void pilhav::info(){
	for (int i = 0; i < tamanho; i++)
	{
		if (i == tamanho-1)
		{
			posTopo = i;
		}
	}
	cout << tamanho << " " << posTopo << endl;
}


int main(){
	
	int vetor[20];
	pilhav pilha;
	int dados;
	int topo, desempilha;
	for (int i = 0; i < 5; i++)
	{
		cin >> vetor[i];
		dados = vetor[i];
		pilha.empilha(dados);
	}
	
	for (int i = 0; i < 3; i++)
	{
		desempilha = pilha.desempilha();
		cout << desempilha << " ";
	}
	
	for (int i = 0; i < 4; i++)
	{
		cin >> vetor[i];
		dados = vetor[i];
		pilha.empilha(dados);
	}
	for (int i = 0; i < 3; i++)
	{
		desempilha = pilha.desempilha();
		cout << desempilha << " ";
	}

	cout << endl;
	topo = pilha.espia();
	cout << topo << endl;
	pilha.depura();
	cout << endl;
	pilha.info();
	
	return 0;
};
