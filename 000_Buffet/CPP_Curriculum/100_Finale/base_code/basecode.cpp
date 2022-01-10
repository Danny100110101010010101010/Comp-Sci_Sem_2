// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char x;
	char dave;
	char w;
	int a;
	int i;
	int length;
	cout<<"you ready for the snow! ";
	cin>>dave;
	cout<<"How much snow! ";
	cin>>length;
	cout<<"Choose your own Snowflake ";
	cin>>w;
	if(dave=='y'){
		for(i == 0; i < length; i++){
			cout<<x<<endl;
		}
		
	}
	
	while(true){
		
		a=a+1;
		gotoxy(7,6+a);
		cout<<w<<endl;
		sleep(1);
		gotoxy(7,6+a);
		cout<<" "<<endl;
		
	}
}
	
	 
	
		
	
	




