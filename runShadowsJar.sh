
OUTPUT=$(lsof -i:1717)


echo "${OUTPUT}"
if [ -z "$OUTPUT" ]
then
        echo "\$OUTPUT is empty"
        nohup java -jar build/libs/shadow-0.0.1-SNAPSHOT.jar &
	tail -f nohup.out
else
        echo "\$OUTPUT is NOT empty"
        echo "Port 1717: is already in use, please kill the process before starting the app"
fi


