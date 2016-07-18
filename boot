#!/usr/bin/env bash
SEP="==================="

confd -onetime -backend env

echo "Wrote nginx config..."
echo $SEP
cat /etc/nginx/conf.d/proxy.conf
echo $SEP

echo "Starting up nginx now..."
nginx -g "daemon off;"
