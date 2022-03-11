object Form5: TForm5
  Left = 0
  Top = 0
  Caption = 'Form5'
  ClientHeight = 439
  ClientWidth = 818
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  PixelsPerInch = 96
  DesignSize = (
    818
    439)
  TextHeight = 15
  object Panel1: TPanel
    AlignWithMargins = True
    Left = 0
    Top = 0
    Width = 818
    Height = 368
    Anchors = [akLeft, akTop, akRight, akBottom]
    Caption = 'Panel1'
    TabOrder = 0
    ExplicitWidth = 705
    ExplicitHeight = 371
    DesignSize = (
      818
      368)
    object StringGrid1: TStringGrid
      AlignWithMargins = True
      Left = 0
      Top = 0
      Width = 818
      Height = 362
      Anchors = [akLeft, akTop, akRight, akBottom]
      TabOrder = 0
    end
  end
  object Panel2: TPanel
    AlignWithMargins = True
    Left = 0
    Top = 368
    Width = 818
    Height = 70
    Anchors = [akLeft, akTop, akRight, akBottom]
    TabOrder = 1
    ExplicitWidth = 705
    ExplicitHeight = 73
    object Label1: TLabel
      Left = 511
      Top = 32
      Width = 6
      Height = 15
      Caption = #224
    end
    object btVoltar: TButton
      Left = 16
      Top = 24
      Width = 75
      Height = 25
      Caption = 'Voltar'
      TabOrder = 0
    end
    object btFiltrar: TButton
      Left = 672
      Top = 24
      Width = 75
      Height = 25
      Caption = 'Filtrar'
      TabOrder = 1
    end
    object btPeriodoI: TEdit
      Left = 376
      Top = 24
      Width = 121
      Height = 23
      TabOrder = 2
      Text = 'In'#237'cio'
    end
    object edPriodoF: TEdit
      Left = 536
      Top = 24
      Width = 121
      Height = 23
      TabOrder = 3
      Text = 'Final'
    end
  end
end
