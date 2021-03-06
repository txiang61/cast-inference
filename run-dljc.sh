#!/bin/bash

# this script depends on the checker branch of Charles's fork of dljc:
# https://github.com/CharlesZ-Chen/do-like-javac.git
# (this is not a good way to solve the problem, but currently since
# dljc override the javac classpath in its cmd, thus I have to add a little code
# of joining the sys CLASSPATH to the --classpath in dljc's javac cmd.)

CUR_DIR=$(pwd)
ROOT=$(cd $(dirname "$0")/.. && pwd)
CAST_CHECKER=$ROOT/cast_checker
DLJC=$ROOT/do-like-javac

export CLASSPATH=$CAST_CHECKER/bin:$CAST_CHECKER/lib

if [ ! -d $DLJC ] ; then
    cd $ROOT
    git clone https://github.com/CharlesZ-Chen/do-like-javac.git --branch checker
fi

#parsing build command of the target program
build_cmd=$1
shift
while [ $# -gt 0 ]
do
    build_cmd="$build_cmd $1"
    shift
done

cd $CUR_DIR

python $DLJC/dljc -t checker --checker cast.CastChecker -- $build_cmd
