import java.util.Scanner;

public class Questao1
{

	//encontrar o numero de divisores
	public static int divisores(int n){
		//definir dados
		int div = 0;

		for(int j=1; j<=n; j++){
			if(n%j == 0){
				div++;
			}//fim se
		}//fim para

		//retornar
		return(div);
	}//fim divisores

	
	public static int divisores2 (int n, int p){
		//definir dados
		  int cont = 0;
	  	  int x,j,k,m=0;
		  int resto;

		for(int i = 1; i<=n; i++){
			if(n%i == 0){
				System.out.println("div"+i);

				for(j=2; j<=p; j++){
					k = divisores(j);
					
					if(k == 2){
//					System.out.println("j"+j);
						m = i/j;
//						resto = i % j;
//						System.out.println("j"+j);
						System.out.println("m"+m);
				
						while(m%j != 1 || m%j!=0){
							m = m/j;
//							resto = m % j;
						}
//						System.out.println("m"+m);
					}
				}//fim para
				System.out.println("M Final "+m);
			}
		}

		return (0);
	}


	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p;

		p = sc.nextInt();
		System.out.println(divisores2(n,p));
//		n = n * p;
//		System.out.println(n);

	}//fim metodo principal
}//fim classe
