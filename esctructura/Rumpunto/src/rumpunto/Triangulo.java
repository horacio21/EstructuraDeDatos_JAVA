/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumpunto;

/**
 *
 * @author Jean_Carlos
 */
public class Triangulo 
{
    private Punto p1,p2,p3;
   Triangulo(){p1=new Punto();p2=new Punto();p3=new Punto();}

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP3() {
        return p3;
    }

    public void setP3(Punto p3) {
        this.p3 = p3;
    }
    
  
    
    
    public void printfTr()
     {
         //System.out.println("X="+p1.getX()+","+"Y="+p2);
     System.out.println("----------------------------------------------------------");  
     System.out.printf("~~~~~~~~~~~~~~~~~~~\n");
     System.out.println("---Coordenada---");
     System.out.printf("~~~~~~~~~~~~~~~~~~~");
     System.out.println();
     System.out.printf("P1:\t"); p1.printf();
     System.out.printf("P2:\t");p2.printf();
     System.out.printf("P3:\t");p3.printf();
     System.out.println();
     System.out.printf("~~~~~~~~~~~~~~~~~~~\n");
     System.out.println("---DistanciA---");
     System.out.printf("~~~~~~~~~~~~~~~~~~~\n");
     System.out.println("A,B= "+Dp1ap2());
     System.out.println("B,C= "+Dp2ap3());
     System.out.println("C,A= "+Dp3ap1());
     System.out.println();
     System.out.printf("~~~~~~~~~~~~~~~~~~~\n");
     System.out.println("----Angulo----");
     System.out.printf("~~~~~~~~~~~~~~~~~~~");
     System.out.println();
     System.out.println("Angulo A= "+Angulo_A());
     System.out.println("Angulo B= "+Angulo_B());
     System.out.println("Angulo c= "+Angulo_C());
     System.out.println();
     System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
     System.out.println("---Tipo_de_Triangulo---");
     System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     System.out.println();
     System.out.println(tipo_Tr());
     System.out.println("----------------------------------------------------------"); 
     
     }
    
 
     void setP1(float x, float y) 
     {
        p1.set(x, y);
    }
     
     void setP2(float x, float y) 
     {
        p2.set(x, y);
    }
     
     void setP3(float x, float y) 
     {
        p3.set(x, y);
    }
     
     
     
     public float Dp1ap2()
    {return p1.distancia(p2);}

     
       public float Dp2ap3()
    {return p2.distancia(p3); }
       
        public float Dp3ap1()
    {return p3.distancia(p1); }
        
        
        
           public float Angulo_A()
     {
     float anga,bj,a=(float)Math.pow(Dp2ap3(),2),b=(float)Math.pow(Dp3ap1(),2),c=(float)Math.pow(Dp1ap2(),2);
     bj= 2*Dp3ap1()*Dp1ap2();
     anga=(float) (Math.round((Math.toDegrees(Math.acos((b+c-a)/(bj))))*1000.0)/1000.0);
     return anga;
           
     }
           
             public float Angulo_B()
     {
     float anga,bj,a=(float)Math.pow(Dp2ap3(),2),b=(float)Math.pow(Dp3ap1(),2),c=(float)Math.pow(Dp1ap2(),2);
     bj= 2*Dp2ap3()*Dp1ap2();
     anga=(float) (Math.round((Math.toDegrees(Math.acos((a+c-b)/(bj))))*1000.0)/1000.0);
     return anga;
           
     }
                  
            public float Angulo_C()
     {
     float anga,bj,a=(float)Math.pow(Dp2ap3(),2),b=(float)Math.pow(Dp3ap1(),2),c=(float)Math.pow(Dp1ap2(),2);
     bj= 2*Dp2ap3()*Dp3ap1();
     anga=(float) (Math.round((Math.toDegrees(Math.acos((a+b-c)/(bj))))*1000.0)/1000.0);
     return anga;
           
     }
                               
     public String tipo_Tr()
     {
         if(Angulo_A()==Angulo_B()&&Angulo_A()==Angulo_C()&&Angulo_B()==Angulo_C())
         {
         
         return "Aviso:(Triangulo_Equilatero)";
         
         }
         
         if(Angulo_A()==Angulo_B()||Angulo_A()==Angulo_C()||Angulo_B()==Angulo_C()||Angulo_B()==Angulo_A()||Angulo_C()==Angulo_A())
         {
              return "Aviso:(Triangulo_Isocele)";
         }else{return "Aviso:(Triangulo_Escaleno)";}
         
         
         
     }
     
          
                               
                             
        public boolean Verificar (){
        float a = p1.Pendiente(p2);
        float b = p1.Pendiente(p3);
        float c = p2.Pendiente(p3);
        
        if (a == b && b == c)
            return false;
        else
            return true;
    }
}
