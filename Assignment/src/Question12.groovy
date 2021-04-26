/Part1/
def username="Sakshi_Bobde"
def password="Sakshi@17"
String str= username + "," + password
byte[] byteArray= str.getBytes()
println byteArray
String encode=byteArray.encodeBase64().toString()
println "encodes String is : $encode"

/Part2/
byte[] decode=encode.decodeBase64()
println "decoded String is: $decode"
assert str== new String(decode)
