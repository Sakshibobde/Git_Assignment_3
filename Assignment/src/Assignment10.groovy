String line='''Hello, Groovy
hope you are doing good!
see you again'''
int vowels=0
line=line.toLowerCase()
for(int i=0; i<line.length(); i++) {
	char ch = line.charAt(i)
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		++vowels;
	}
		
}
System.out.println("vowels:"+vowels)
