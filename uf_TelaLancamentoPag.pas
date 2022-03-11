unit uf_TelaLancamentoPag;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, Vcl.ExtCtrls;

type
  TForm4 = class(TForm)
    Panel1: TPanel;
    cbFuncionario: TComboBox;
    edValorHora: TEdit;
    edPeriodo: TEdit;
    edHorasTrabalhadas: TEdit;
    btVoltar: TButton;
    btLancar: TButton;
    Label1: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    Label4: TLabel;
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form4: TForm4;

implementation

{$R *.dfm}

end.
