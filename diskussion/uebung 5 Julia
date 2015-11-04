	public static void main(String[] args) {
		int z=5,
			s=11,
			m=2;
		boolean[][]a=new boolean[z][s];
		boolean[][]b=new boolean[z][s];
		
		System.out.println("Array a:");
		
		// Werte in den Array a schreiben und ausgeben
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				if(j%m==0){
					a[i][j]=true;					
				}else{
					a[i][j]=false;
				}
				if(a[i][j]==true){
					System.out.print("X\t");
				}else{
					System.out.print("_\t");
				}	
			}
			m++;
			System.out.println();
		}
		System.out.println(" \nArray b:");
		
		//Nachbarn zählen:
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				int n=0;
				
		//Nachbarn zählen für Ecke [0][0]
				if(i == 0 && j == 0){
					for(int k = i;k <= i+1;++k){
						for(int h = j;h <= j+1;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}
		//Nachbarn zählen für Ecke [0][Ende]		
				if(i == 0 && j == a[i].length-1){
					for(int k = i;k <= i+1;++k){
						for(int h = j-1;h <= j;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}
		//Nachbarn zählen für Ecke [Ende][0]		
				if(i == a.length-1 && j == 0){
					for(int k = i-1;k <= i;++k){
						for(int h = j;h <= j+1;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}
		//Nachbarn zählen für Ecke [Ende][Ende]		
				if(i == a.length-1 && j == a[i].length-1){
					for(int k = i-1;k <= i;++k){
						for(int h = j-1;h <= j;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}
		//Nachbarn zählen für den oberen Rand		
				if(i == 0 && j != 0 && j != a[i].length-1){
					for(int k = i;k <= i+1;++k){
						for(int h = j-1;h <= j+1;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}		
		//Nachbarn zählen für den linken Rand
				if(j == 0 && i != 0 && i != a.length-1){
					for(int k = i-1;k <= i+1;++k){
						for(int h = j;h <= j+1;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}
		//Nachbarn zählen für den unteren Rand
				if(i == a.length-1 && j != 0 && j != a[i].length-1){
					for(int k = i-1;k <= i;++k){
						for(int h = j-1;h <= j+1;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}
		//Nachbarn zählen für den rechten Rand		
				if(j == a[i].length-1 && i != 0 && i != a.length-1){
					for(int k = i-1;k <= i+1;++k){
						for(int h = j-1;h <= j;++h){
							if((a[k][h]==true) && (k != i || h != j)){										
									++n;	
							}
						}	
					}
				}
							
		//Nachbarn zählen für innere-Elemente	
				if((i != 0 && j != 0)){
					if((i != a.length-1) && (j != a[i].length-1)){
						
						for(int k = i-1;k <= i+1;++k){
							for(int h = j-1;h <= j+1;++h){
								if((a[k][h]==true) && (k != i || h != j)){										
										++n;	
								}
							}				
						}
						
					}
				}				
				
		//Regeln
				if(n > 3 || n < 2){
					b[i][j]=false;
				}
				if(a[i][j]==true){
					if(n == 2 || n == 3){
						b[i][j]=true;
					}
				}else{
					if(n == 3){
						b[i][j]=true;
					}
				}			
				//System.out.print(n+"\t");
			}
			//System.out.println();
		}	
		//Ausgabe Array B
		for(int i=0;i<b.length;++i){
			for(int j=0;j<b[i].length;++j){
				if(b[i][j]==true){
					System.out.print("X\t");
				}else{
					System.out.print("_\t");
				}
				
			}
			System.out.println();
		}
	}
