package A;

public class Stats_Builder implements Robot {

  private final int canon, bouclier, freq;
  private final String nom;
  private int vie;

  public Stats_Builder(Builder builder) {
    this.canon = builder.canon;
    this.bouclier = builder.bouclier;
    this.freq = builder.freq;
    this.nom = builder.nom;
    this.vie = builder.vie;
  }

  @Override
  public int getCanon() {
    return canon;
  }

  @Override
  public int getShield() {
    return bouclier;
  }

  @Override
  public int getFreq() {
    return freq;
  }

  @Override
  public String getName() {
    return nom;
  }

  @Override
  public int diffLife(int i) {
    return vie += i;
  }

  // Classe Interne Builder
  public static class Builder {

    private final String nom;
    private int vie = 100;
    private int canon = 1;
    private int bouclier = 1;
    private int freq = 100;

    public Builder(String nom) {
      this.nom = nom;
    }

    public Builder getVie(int vie) {
      this.vie = vie;
      return this;
    }

    public Builder getCanon(int canon) {
      this.canon = canon;
      return this;

    }

    public Builder getBouclier(int bouclier) {
      this.bouclier = bouclier;
      return this;
    }

    public Builder getFreq(int freq) {
      this.freq = freq;
      return this;
    }

    public Robot build() {
      return new Stats_Builder(this);
    }
  }

}
