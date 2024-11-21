/*Nome:Cássio Eid Kobayashi Yonetsuka
Rm:99678

Nome: Allan Von Ivanov
Rm:98705 */
package br.com.fiap.solaris.model.entity;

import br.com.fiap.solaris.model.dto.RequisicaoNovoPedido;
import jakarta.persistence.*;


import java.math.BigDecimal;

@Entity(name = "Item")
@Table(name = "item")
public class PlacaSolar{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoProduto;
    private String nomeProduto;
    private BigDecimal valor;
    private String urlProduto;
    private String urlImagem;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Long getCodigoProduto(){
        return codigoProduto;
    }
    public String getNomeProduto(){
        return nomeProduto;
    }
    public BigDecimal getValor(){
        return valor;
    }
    public String getUrlProduto(){
        return urlProduto;
    }
    public String getUrlImagem(){
        return urlImagem;
    }
    public String getDescricao(){
        return descricao;
    }

    public void setCodigoProduto(Long codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    public void setNomeProduto(String nome){
        this.nomeProduto = nome;
    }
    public void setValor(BigDecimal valor){
        this.valor = valor;
    }
    public void setUrlProduto(String urlProduto){
        this.urlProduto = urlProduto;
    }
    public void setUrlImagem(String urlImagem){
        this.urlImagem = urlImagem;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public PlacaSolar(){}

    public PlacaSolar(RequisicaoNovoPedido requisicao){
        this.nomeProduto = requisicao.nomeProduto();
        this.urlProduto = requisicao.urlProduto();
        this.urlImagem = requisicao.urlImagem();
        this.descricao = requisicao.descricao();
        this.status = StatusPedido.AGUARDANDO;
    }
}
