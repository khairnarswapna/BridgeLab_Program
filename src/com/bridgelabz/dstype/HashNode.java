
/*hashNode*/
 
 /* @param <K>	key type
 * @param <V>	value type
 */

package com.bridgelabz.dstype;


public class HashNode<K, V> 
{
	K key;
	V value;
	HashNode<K, V> next;

	HashNode(K key, V value) 
	{
		this.key = key;
		this.value = value;
	}
}
