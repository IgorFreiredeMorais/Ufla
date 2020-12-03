#include <iostream>

using namespace std;

class noh{
	friend class fila;
	private:
		string mNome;
		noh* mProximo;
	public:
		noh(string nome);
};
noh::noh(string nome){
	mNome = nome;
	mProximo = NULL;
}
class fila{
	private:
		noh* mInicio;
		noh* mFim;
		unsigned mTamanho;
	public:
		fila();
		~fila();
		void enfileira(string nome);
		string desenfileira();
		void limpaFila();
		bool vazia();
		
};
fila::fila(){
	mInicio = NULL;
	mFim = NULL;
	mTamanho = 0;
}
fila::~fila(){
	limpaFila();
}

void fila::limpaFila(){
	while (mTamanho > 0)
	{
		desenfileira();
	}
}

void fila::enfileira(string nome){
	noh* novo = new noh(nome);
	if (mTamanho == 0)
	{
		mInicio = novo;
	}
	else{
	mFim->mProximo = novo;
	}
	mFim = novo;
	mTamanho++;	
}
	

string fila::desenfileira(){
	string nome = mInicio->mNome;
	noh* temp = mInicio;
	mInicio = mInicio->mProximo;
	delete temp;
	mTamanho--;
	if (mTamanho == 0)
	{
		mFim = NULL;
	}
	return nome;
}
bool fila::vazia(){
	return(mTamanho == 0);
}
int main(){
	fila f1, f2, f3;
	string senha, nome;
	int  contadorAtender = 0, contadorPrioridade = 0;
	
	cin >> senha;
	
	while (senha != "fim")
	{
		if (senha == "normal")
		{
			cin >> nome;
			f2.enfileira(nome);
		}
		else if (senha == "prioridade")
		{
			cin >> nome;
			f1.enfileira(nome);
		}
		else if (senha == "atender")
		{	
			if (f1.vazia() && f2.vazia())
			{
				cout << "AGUARDE" << endl;
				contadorAtender--;
			}
			
			if ((contadorPrioridade == 3) or (f1.vazia()))
			{	
				if (not f2.vazia())
				{
					f3.enfileira(f2.desenfileira());
					contadorPrioridade = 0;
				}
				else
				{
					if(not f1.vazia()){
						f3.enfileira(f1.desenfileira());
						contadorPrioridade++;
					}
				}
			}
			else
			{
				f3.enfileira(f1.desenfileira());
				contadorPrioridade++;
			}

			contadorAtender++;
		}
		cin >> senha;
	}
	for (int i = 0; i < contadorAtender; i++)
	{
		cout << f3.desenfileira() << endl;
	}
	return 0;
	
};
