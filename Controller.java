package controlador;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	char segundoAnterior, segundoAtual;
	int portaPosicao = 0, portaSentido = 0, portaEstado = 0;
	List <String> saida = new ArrayList <String> ();
	
	//portaSentido: 0(abrir),  1(fechar).
	//portaEstado:  0(parada), 1(movendo), 2(pausada).
	
	public String execute(String entrada) {
		
		for(int i = 0 ; i < entrada.length() ; i++) {
			
			segundoAtual = entrada.charAt(i);
			
			switch(segundoAtual) {
			
				case '.':
					if(portaEstado == 0 || portaEstado == 2) {
						saida.add(Integer.toString(portaPosicao));
						continue;
					}
					
					else if(portaEstado == 1) {
						if(portaSentido == 0) {
							if(portaPosicao < 5) portaPosicao++;
							saida.add(Integer.toString(portaPosicao));
							continue;
						}
						
						if(portaSentido == 1) {
							if(portaPosicao > 0) portaPosicao--;
							saida.add(Integer.toString(portaPosicao));
							continue;							
						}
					}
				
				case 'P':
					
					//Abrir
					if(portaSentido == 0) {
						if(portaEstado == 0) {
							portaEstado = 1;
							
							if(portaPosicao < 5) portaPosicao++;
							saida.add(Integer.toString(portaPosicao));
							continue;
						}
						
						else if(portaEstado == 1) {
							portaEstado = 2;
							saida.add(Integer.toString(portaPosicao));
							continue;
						}
						
						else if(portaEstado == 2) {
							portaEstado = 1;
							
							if(portaPosicao < 5) portaPosicao++;
							saida.add(Integer.toString(portaPosicao));
							continue;
						}
					}
					
					//Fechar
					else if(portaSentido == 1) {
						if(portaEstado == 0) {
							portaEstado = 1;
							
							if(portaPosicao > 0) portaPosicao--;
							saida.add(Integer.toString(portaPosicao));
							continue;	
						}
						
						else if(portaEstado == 1) {
							portaEstado = 2;
							saida.add(Integer.toString(portaPosicao));
							continue;
						}
						
						else if(portaEstado == 2) {
							portaEstado = 1;
							
							if(portaPosicao > 0) portaPosicao--;
							saida.add(Integer.toString(portaPosicao));
							continue;	
						}
					}
					
				case 'O':
					
					//Abrindo
					if(portaSentido == 0) {
						portaSentido = 1;
						
						if(portaPosicao > 0) portaPosicao--;
						saida.add(Integer.toString(portaPosicao));
						continue;
						
					}
					
					//Fechando
					if(portaSentido == 1) {
						portaSentido = 0;
						
						if(portaPosicao < 5) portaPosicao++;
						saida.add(Integer.toString(portaPosicao));
						continue;
						
					}
			}
		}
		
		String resultado = String.join("", saida);
		System.out.println(resultado);
		return resultado;
	}
}