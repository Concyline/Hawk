package br.com.hawk;

import android.content.Context;
import android.util.Base64;

public class ConcealEncryption implements Encryption {

  //private final Crypto crypto;
  private Encripta encripta;

  public ConcealEncryption() throws Exception {
    encripta = new Encripta();
  }

 /* public ConcealEncryption(Context context) {
    this(new SharedPrefsBackedKeyChain(context, CryptoConfig.KEY_256));
  }

  protected ConcealEncryption(KeyChain keyChain) {
    this(AndroidConceal.get().createDefaultCrypto(keyChain));
  }

  protected ConcealEncryption(Crypto crypto) {
    this.crypto = crypto;
  }*/

  /*@Override public boolean init() {
    return crypto.isAvailable();
  }*/

 /* Override public boolean init() {
    return true;
  }*/

  @Override
  public boolean init() {
    return true;
  }

  @Override public String encrypt(String key, String plainText) throws Exception {
    return encripta.encrypt(plainText);
  }

  @Override public String decrypt(String key, String cipherText) throws Exception {
    return encripta.decrypt(cipherText);
  }

  /*@Override public String encrypt(String key, String plainText) throws Exception {
    Entity entity = Entity.create(key);
    byte[] bytes = crypto.encrypt(plainText.getBytes(), entity);
    return Base64.encodeToString(bytes, Base64.NO_WRAP);
  }

  @Override public String decrypt(String key, String cipherText) throws Exception {
    Entity entity = Entity.create(key);
    byte[] decodedBytes = Base64.decode(cipherText, Base64.NO_WRAP);
    byte[] bytes = crypto.decrypt(decodedBytes, entity);
    return new String(bytes);
  }*/

}
