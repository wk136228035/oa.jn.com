package oa.jn.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

//@Configuration
@PropertySource("classpath:/properties/redis.properties")
public class RedisClusterConfig {
	
	@Value("${redis.nodes}")
	private String nodes;
	
	@Bean
	public JedisCluster jedisCluster() {
		String[] node = nodes.split(",");
		Set<HostAndPort> nodesSet = new HashSet<HostAndPort>();
		for (String host_port : node) {
			String[] args = host_port.split(":");
			nodesSet.add(new HostAndPort(args[0], Integer.parseInt(args[1])));
		}
		System.out.println(nodesSet.toString());
		return new JedisCluster(nodesSet);
	}
}
