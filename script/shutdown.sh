pid=`ps -ef | grep sample_webapp.jar | grep -v grep | awk '{print $2}'`
echo "Killing process $pid"
kill -9 $pid
