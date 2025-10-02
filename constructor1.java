class constructor1{
//static int o=1;

//static int v=1;
//static float s = 0;
   
static int  vortex(int a, int b){
int[][] vortex = new int [12][2];
	vortex[0][0]=0;
	vortex[0][1]=1;

	vortex[1][0]=1;
	vortex[1][1]=2;

	vortex[2][0]=2;
	vortex[2][1]=3;

	vortex[3][0]=3;
	vortex[3][1]=0;

	vortex[4][0]=4;
	vortex[4][1]=5;

	vortex[5][0]=5;
	vortex[5][1]=6;

	vortex[6][0]=6;
	vortex[6][1]=7;

	vortex[7][0]=7;
	vortex[7][1]=4;

	vortex[8][0]=0;
	vortex[8][1]=4;

	vortex[9][0]=1;
	vortex[9][1]=5;

	vortex[10][0]=2;
	vortex[10][1]=6;

	vortex[11][0]=3;
	vortex[11][1]=7;
return vortex[a][b];
}
static int plano(int a, int b){
int[][] plano=new int[16][4];
	plano[0][0]=0;
	plano[0][1]=1;
	plano[0][2]=2;
	plano[0][3]=3;
	

	plano[1][0]=4;
	plano[1][1]=5;
	plano[1][2]=6;
	plano[1][3]=7;
    

	plano[2][0]=10;
	plano[2][1]=11;
	plano[2][2]=6;
	plano[2][3]=2;
	

	plano[3][0]=8;
	plano[3][1]=9;
	plano[3][2]=0;
	plano[3][3]=4;
	

	plano[4][0]=9;
	plano[4][1]=10;
	plano[4][2]=1;
	plano[4][3]=5;
	

	plano[5][0]=8;
	plano[5][1]=11;
	plano[5][2]=7;
	plano[5][3]=3;
return plano[a][b];
}	
	// printf("Ya ha salido el ya...");
}	

/*
	for(int i=0;i<8;i++){
	circulo[i][0]=cos(i*2*Math.PI/8)*g;
	circulo[i][1]=sin(i*2*Math.PI/8)*g;
	}

	// EL UNO Y EL DOS COSTITUYEN EL EJE  X (UNO ENFRENTE DEL OTRO)

	     for(int i=0;i<8;i++){

	     circulos[0][0][i][0]=circulo[i][0];
	     circulos[0][0][i][1]=circulo[i][1];
	     circulos[0][0][i][2]=-.5f;

	     m_circulo[0][0][0] = 0;
	     m_circulo[0][0][1] = 0;
	     m_circulo[0][0][2] = -.5f;
	     }


	         for(int i=0;i<8;i++){
	     circulos[1][0][i][0]=circulo[i][0]-.25f;
	     circulos[1][0][i][1]=circulo[i][1]-.25f;
	     circulos[1][0][i][2]=.5f;

	     m_circulo[1][0][0] = -.25f;
	     m_circulo[1][0][1] = -.25f;
	     m_circulo[1][0][2] = .5f;

	     circulos[1][1][i][0]=circulo[i][0]+.25f;
	     circulos[1][1][i][1]=circulo[i][1]+.25f;
	     circulos[1][1][i][2]=.5f;

	     m_circulo[1][1][0] = +.25f;
	     m_circulo[1][1][1] = +.25f;
	     m_circulo[1][1][2] = .5f;
	     }


	     //EL 3 Y EL 4 CONSTITUYEN EL EJE Y (UNO ENFRENTE DEL OTRO)

	     for(int i=0;i<8;i++){
	     circulos[2][0][i][0]=.5f;
	     circulos[2][0][i][1]=circulo[i][0]-.25f;
	     circulos[2][0][i][2]=circulo[i][1]+.25f;

	     m_circulo[2][0][0] = .5f;
	     m_circulo[2][0][1] = -.25f;
	     m_circulo[2][0][2] = .25f;

	     circulos[2][1][i][0]=.5f;
	     circulos[2][1][i][1]=circulo[i][0];
	     circulos[2][1][i][2]=circulo[i][1];

	     m_circulo[2][1][0] = .5f;
	     m_circulo[2][1][1] = 0;
	     m_circulo[2][1][2] = 0;

	     circulos[2][2][i][0]=.5f;
	     circulos[2][2][i][1]=circulo[i][0]+.25f;
	     circulos[2][2][i][2]=circulo[i][1]-.25f;

	     m_circulo[2][2][0] = .5f;
	     m_circulo[2][2][1] = +.25f;
	     m_circulo[2][2][2] = -.25f;

	     }


	          //System.out.println(caras);

	     for(int i=0;i<8;i++){

	     circulos[3][0][i][0]=-.5f;
	     circulos[3][0][i][1]=circulo[i][0]-.25f;
	     circulos[3][0][i][2]=circulo[i][1]-.25f;

	     m_circulo[3][0][0] = -.5f;
	     m_circulo[3][0][1] = -.25f;
	     m_circulo[3][0][2] = -.25f;

	     circulos[3][1][i][0]=-.5f;
	     circulos[3][1][i][1]=circulo[i][0]+.25f;
	     circulos[3][1][i][2]=circulo[i][1]-.25f;

	     m_circulo[3][1][0] = -.5f;
	     m_circulo[3][1][1] = +.25f;
	     m_circulo[3][1][2] = -.25f;

         circulos[3][2][i][0]=-.5f;
	     circulos[3][2][i][1]=circulo[i][0]-.25f;
	     circulos[3][2][i][2]=circulo[i][1]+.25f;

	     m_circulo[3][2][0] = -.5f;
	     m_circulo[3][2][1] = -.25f;
	     m_circulo[3][2][2] = +.25f;

         circulos[3][3][i][0]=-.5f;
	     circulos[3][3][i][1]=circulo[i][0]+.25f;
	     circulos[3][3][i][2]=circulo[i][1]+.25f;

	     m_circulo[3][3][0] = -.5f;
	     m_circulo[3][3][1] = +.25f;
	     m_circulo[3][3][2] = +.25f;

	     }

	     // EL 5 Y EL 6 CONSTITUYEN EL EJE Z (UNO ENFRENTE DEL OTRO)

	         for(int i=0;i<8;i++){


	     circulos[4][0][i][0]=circulo[i][0]-.25f;
	     circulos[4][0][i][1]=.5f;
	     circulos[4][0][i][2]=circulo[i][1]-.25f;

	     m_circulo[4][0][0] = -.25f;
	     m_circulo[4][0][1] = .5f;
	     m_circulo[4][0][2] = -.25f;

	     circulos[4][1][i][0]=circulo[i][0]+.25f;
	     circulos[4][1][i][1]=.5f;
	     circulos[4][1][i][2]=circulo[i][1]-.25f;

	     m_circulo[4][1][0] = +.25f;
	     m_circulo[4][1][1] = .5f;
	     m_circulo[4][1][2] = -.25f;

	     circulos[4][2][i][0]=circulo[i][0];
	     circulos[4][2][i][1]=.5f;
	     circulos[4][2][i][2]=circulo[i][1];

	     m_circulo[4][2][0] = 0;
	     m_circulo[4][2][1] = .5f;
	     m_circulo[4][2][2] = 0;

	     circulos[4][3][i][0]=circulo[i][0]-.25f;
	     circulos[4][3][i][1]=.5f;
	     circulos[4][3][i][2]=circulo[i][1]+.25f;

	     m_circulo[4][3][0] = -.25f;
	     m_circulo[4][3][1] = .5f;
	     m_circulo[4][3][2] = +.25f;

	     circulos[4][4][i][0]=circulo[i][0]+.25f;
	     circulos[4][4][i][1]=.5f;
	     circulos[4][4][i][2]=circulo[i][1]+.25f;

	     m_circulo[4][4][0] = +.25f;
	     m_circulo[4][4][1] = .5f;
	     m_circulo[4][4][2] = +.25f;

	     }


	     for(int i=0;i<8;i++){

	     circulos[5][0][i][0]=circulo[i][0]-.25f;
	     circulos[5][0][i][1]=-.5f;
	     circulos[5][0][i][2]=circulo[i][1]-.25f;

	     m_circulo[5][0][0] = -.25f;
	     m_circulo[5][0][1] = -.5f;
	     m_circulo[5][0][2] = -.25f;

	     circulos[5][1][i][0]=circulo[i][0]+.25f;
	     circulos[5][1][i][1]=-.5f;
	     circulos[5][1][i][2]=circulo[i][1]-.25f;

	     m_circulo[5][1][0] = +.25f;
	     m_circulo[5][1][1] = -.5f;
	     m_circulo[5][1][2] = -.25f;

	     circulos[5][2][i][0]=circulo[i][0]+.25f;
	     circulos[5][2][i][1]=-.5f;
	     circulos[5][2][i][2]=circulo[i][1];

	     m_circulo[5][2][0] = +.25f;
	     m_circulo[5][2][1] = -.5f;
	     m_circulo[5][2][2] = 0;

	     circulos[5][3][i][0]=circulo[i][0]-.25f;
	     circulos[5][3][i][1]=-.5f;
	     circulos[5][3][i][2]=circulo[i][1];

	     m_circulo[5][3][0] = -.25f;
	     m_circulo[5][3][1] = -.5f;
	     m_circulo[5][3][2] = 0;

	     circulos[5][4][i][0]=circulo[i][0]-.25f;
	     circulos[5][4][i][1]=-.5f;
	     circulos[5][4][i][2]=circulo[i][1]+.25f;

	     m_circulo[5][4][0] = -.25f;
	     m_circulo[5][4][1] = -.5f;
	     m_circulo[5][4][2] = +.25f;

	     circulos[5][5][i][0]=circulo[i][0]+.25f;
	     circulos[5][5][i][1]=-.5f;
	     circulos[5][5][i][2]=circulo[i][1]+.25f;

	     m_circulo[5][5][0] = +.25f;
	     m_circulo[5][5][1] = -.5f;
	     m_circulo[5][5][2] = +.25f;

	     }

*/



