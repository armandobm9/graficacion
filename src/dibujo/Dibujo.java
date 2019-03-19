package dibujo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Dibujo extends Canvas{
	
	public Dibujo () {
	}
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		//Coordenadas de la esquina superior izquierda del hospital
		int x=50, y=100;
		//Implementación de fondo degradado azul
		GradientPaint verticalGradient = new GradientPaint(0, 0, new Color (135, 189, 255), 0, getHeight(), new Color (211, 231, 255));
		g2d.setPaint(verticalGradient);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		//Contorno fachada inferior
		g.setColor(new Color(32, 32, 32));
    	g.fillRect(x+20, 515, 1220, 200);
    	//Sombra gris tejado izquierdo
    	g.setColor(Color.GRAY);
    	int [] ax2 = {x+340, x+450 , x+450};
        int [] ay2 = {80, 55, 80};
    	g.fillPolygon(ax2, ay2, 3);
    	g.setColor(new Color(245, 245, 245));
    	int [] bx2 = {x+340, x+450 , x+450};
        int [] by2 = {85, 60, 85};
    	g.fillPolygon(bx2, by2, 3);
    	
	    //Ciclo para las tres estructuras (fachadas) principales
	    for (int i=0; i<3; i++) {
	    	if (i==0 || i==2) {
	    		//Contorno fachada izquierda
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x, y, 360, 400);
		    	//Implementacion de tejado y sombras lado izquierdo
		    	if (i==0) {
			    	g.fillRect(x-20, y-30, 380, 35);
			    	g.setColor(new Color (0, 85, 255));
			    	g.fillRect(x-15, y-25, 370, 25);
			    	g.setColor(new Color(51, 153, 255));
			    	g.fillRect(x-15, y-25, 370, 5);
			    	g.setColor(new Color(245, 245, 245));
			    	g.fillRect(x+25, 520, 330, 190);
			    	g.fillRect(x+360, 80, 90, 415);
		    	}
		    	//Implementacion de tejado y sombras lado derecho
		    	else {
		    		g.fillRect(x, y-30, 380, 35);
			    	g.setColor(new Color (0, 85, 255));
			    	g.fillRect(x+5, y-25, 370, 25);
			    	g.setColor(new Color(51, 153, 255));
			    	g.fillRect(x+5, y-25, 370, 5);
			    	g.setColor(new Color(245, 245, 245));
			    	g.fillRect(x+5, 520, 330, 190);
			    	g.fillRect(860, 80, 90, 415);
		    	}
		    	//Paredes superiores izquierda y derecha
		    	g.setColor(new Color(245, 245, 245));
		    	g.fillRect(x+5, y+5, 350, 390);
		    	//Contornos, ventanas y puerta inferior izquierda y derecha
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x+40, 635, 100, 50);
		    	g.fillRect(x+220, 635, 100, 50);
		    	g.fillRect(x+150, 635, 60, 75);
		    	g.setColor(new Color(245, 245, 245));
		    	g.fillRect(x+43, 638, 94, 44);
		    	g.fillRect(x+223, 638, 94, 44);
		    	g.fillRect(x+155, 640, 50, 70);
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x+45, 640, 90, 40);
		    	g.fillRect(x+225, 640, 90, 40);
		    	g.fillRect(x+160, 645, 40, 28);
		    	GradientPaint horizontalGradient = new GradientPaint(0, 0, new Color (115, 161, 217), getWidth(), 0, new Color(211, 231, 255));
		    	g2d.setPaint(horizontalGradient);
		    	g2d.fillRect(x+47, 642, 86, 36);
		    	g2d.fillRect(x+227, 642, 86, 36);
		    	g2d.fillRect(x+162, 647, 36, 24);
	    	}
	    	else {
	    		g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x, y-50, 360, 450);
		    	g.fillRect(x, y-80, 360, 35);
		    	g.setColor(new Color (0, 85, 255));
		    	g.fillRect(x+5, y-75, 350, 25);
		    	g.setColor(new Color(51, 153, 255));
		    	g.fillRect(x+5, y-75, 350, 5);
		    	g.setColor(new Color(245, 245, 245));
		    	g.fillRect(x+5, y-45, 350, 440);
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x+150, y-15, 60, 30);
		    	g.fillRect(x+165, y-30, 29, 60);
		    	g.setColor(new Color (255, 105, 97));
		    	g.fillRect(x+155, y-10, 50, 20);
		    	g.fillRect(x+170, y-25, 20, 50);
		    	g.setColor(new Color(245, 245, 245));
		    	g.fillRect(x-90, 520, 540, 190);
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x-40, 530, 440, 180);
		    	g.setColor(Color.GRAY);
		    	g.fillRect(x-35, 535, 430, 175);
		    	g.setColor(new Color(245, 245, 245));
		    	g.fillRect(x-35, 615, 425, 95);
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x-15, 635, 100, 50);
		    	g.fillRect(x+275, 635, 100, 50);
		    	g.fillRect(x+130, 635, 100, 75);
		    	g.setColor(new Color(245, 245, 245));
		    	g.fillRect(x-12, 638, 94, 44);
		    	g.fillRect(x+278, 638, 94, 44);
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x-10, 640, 90, 40);
		    	g.fillRect(x+280, 640, 90, 40);
		    	GradientPaint horizontalGradient = new GradientPaint(0, 0, new Color (115, 161, 217), getWidth(), 0, new Color(211, 231, 255));
		    	g2d.setPaint(horizontalGradient);
		    	g2d.fillRect(x-8, 642, 86, 36);
		    	g2d.fillRect(x+282, 642, 86, 36);
		    	g.setColor(new Color(245, 245, 245));
		    	g.fillRect(x+135, 640, 43, 70);
		    	g.fillRect(x+183, 640, 42, 70);
		    	g.setColor(new Color(32, 32, 32));
		    	g.fillRect(x+140, 645, 33, 60);
		    	g.fillRect(x+188, 645, 32, 60);
		    	g2d.setPaint(horizontalGradient);
		    	g2d.fillRect(x+143, 648, 27, 54);
		    	g2d.fillRect(x+191, 648, 26, 54);
		    	
		    	   int aux2x=x, aux2y=y, bajo=65;
			        
				        for (int j=0; j<4; j++) {
				        	for (int k=0; k<6; k++) {
				        		g.setColor(new Color(32, 32, 32));
						    	g.fillRect(aux2x+10, aux2y+50, 50, bajo);
						    	g2d.setPaint(horizontalGradient);
						    	g2d.fillRect(aux2x+15, aux2y+55, 40, bajo-10);
						    	aux2x+=58;
				        	}
				        	bajo+=15;
				        	aux2x=x;
				        	aux2y+=bajo-10;
				        }
			        
	    	}
	    	int auxx=x, auxy=y;
	        for (int j=0; j<3; j++) {
	        	for (int k=0; k<3; k++) {
	        		if (i!=1) {
		        		g.setColor(new Color(32, 32, 32));
				    	g.fillRect(auxx+30, auxy+30, 80, 100);
				    	g.setColor(new Color(245, 245, 245));
				    	g.fillRect(auxx+34, auxy+34, 72, 92);
				    	g.setColor(new Color(32, 32, 32));
				    	g.fillRect(auxx+40, auxy+40, 60, 25);
				    	g.fillRect(auxx+40, auxy+70, 60, 50);
				    	
				    	GradientPaint horizontalGradient = new GradientPaint(0, 0, new Color (115, 161, 217), getWidth(), 0, new Color(211, 231, 255));
				    	g2d.setPaint(horizontalGradient);
				    	g2d.fillRect(auxx+43, auxy+43, 54, 19);
				    	g2d.fillRect(auxx+43, auxy+73, 54, 44);
	        		}
	        		else if (i==1){
	        			g.setColor(new Color(32, 32, 32));
	    		    	g.fillRect(x+5, y+50, 350, 5);
	        		}
			    	
	        		auxx+=110;
	        	}
	        	auxy+=120;
	        	auxx=x;
	        }
	        x+=450;   
	    }
	    g.setColor(new Color(32, 32, 32));
	    g.fillRect(30, 495, 1300, 25);
	    g.setColor(new Color(51, 153, 255));
	    g.fillRect(35, 500, 1290, 5);
	    g.setColor(new Color (0, 85, 255));
	    g.fillRect(35, 505, 1290, 9);
	    g.setColor(Color.GRAY);
	    g.fillRect(75, 520, 1210, 5);
	    g.setColor(new Color(32, 32, 32));
    	g.fillRect(390, 520, 580, 90);
    	g.setColor(new Color(245, 245, 245));
    	g.fillRect(395, 520, 570, 85);
    	g.setFont(new Font("Arial", Font.BOLD, 48));
        g.setColor(new Color(32, 32, 32));
        g.drawString("H O S P I T A L", 510, 580);
        g.setColor(Color.GRAY);
    	g.fillRect(55, 105, 350, 5);
    	g.fillRect(505, 55, 350, 5);
    	g.fillRect(955, 105, 350, 5);
    	g.setColor(new Color(32, 32, 32));
    	int [] ex2 = {400, 400 , 500, 500};
        int [] ey2 = {80, 50, 20, 55};
        g.fillPolygon(ex2, ey2, 4);
        int [] hx2 = {960, 960 , 855, 855};
        int [] hy2 = {80, 50, 18, 55};
    	g.fillPolygon(hx2, hy2, 4);
    	g.setColor(new Color(0, 85, 255));
    	int [] fx2 = {405, 405 , 500, 500};
        int [] fy2 = {73, 55, 25, 50};
    	g.fillPolygon(fx2, fy2, 4);
    	int [] gx2 = {955, 955 , 860, 860};
        int [] gy2 = {73, 55, 25, 50};
    	g.fillPolygon(gx2, gy2, 4);
    	
    	int a=405, b=460, c=270, d=200, e=170, f=240;
    	int auxa=405, auxb=460, auxc=270, auxd=200, auxe=170, auxf=240;
    	for (int o=0; o<3; o++) {
	    	for (int n=0; n<2; n++) {
		    	g.setColor(new Color(32, 32, 32));
		    	int [] ix2 = {auxa, auxa , auxb, auxb};
		        int [] iy2 = {auxc, auxd, auxe, auxf};
		        g.fillPolygon(ix2, iy2, 4);
		        GradientPaint horizontalGradient = new GradientPaint(0, 0, new Color (115, 161, 217), getWidth(), 0, new Color(211, 231, 255));
		    	g2d.setPaint(horizontalGradient);
		    	int [] jx2 = {auxa+5, auxa+5 , auxb-5, auxb-5};
		        int [] jy2 = {auxc-10, auxd+5, auxe+10, auxf-5};
		        g.fillPolygon(jx2, jy2, 4);
		        auxa+=60;
		        auxb+=40;
		        auxe-=20;
		        auxd-=30;
		        auxc-=30;
		        auxf-=20;
	    	}
	    	auxa=a;
	        auxb=b;
	        auxe=e+75;
	        auxd=d+75;
	        auxc=c+75;
	        auxf=f+75;
    	}
    	for (int p=0; p<2; p++) {
    	g.setColor(new Color(32, 32, 32));
    	int [] kx2 = {955, 955 , 905, 905};
        int [] ky2 = {270, 200, 170, 240};
    	g.fillPolygon(kx2, ky2, 4);
    	}
	    
	}

}
