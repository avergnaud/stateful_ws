# build
jdk 1.8

wsimport -keep -verbose -d src http://localhost:8080/PremierService?wsdl

wsimport -keep -verbose -d src http://localhost:8080/SecondService?wsdl

génère les deux packages com.example.ws.premier et com.example.ws.second

javac

# run
main class : Client